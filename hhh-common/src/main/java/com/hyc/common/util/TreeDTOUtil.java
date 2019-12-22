package com.hyc.common.util;




import com.hyc.common.bean.TreeDTO;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by hyc on 2018/8/27.
 */
public class TreeDTOUtil {

    public static <T extends TreeDTO> List<T> sort(List<T> treeDTOs) {
        if (null != treeDTOs && treeDTOs.size() > 0) {
            //排序
            Collections.sort(treeDTOs, new Comparator<T>() {
                @Override
                public int compare(T o1, T o2) {
                    if (null == o1.getOrderNo()) {
                        o1.setOrderNo(0);
                    }
                    if (null == o2.getOrderNo()) {
                        o2.setOrderNo(0);
                    }
                    return o1.getOrderNo() - o2.getOrderNo();
                }
            });
            for (T ts : treeDTOs) {
                sort(ts.getChildren());
            }
        }
        return treeDTOs;
    }

    public static <T extends TreeDTO> List<T> getTreeNodesByRoot(List<T> children, T treeRoot) {
        if (null != treeRoot) {
            for (T d : (List<T>) treeRoot.getChildren()) {
                getTreeNodesByRoot(children, d);
            }
            children.add(treeRoot);
        }
        return children;
    }

    /**
     * 查询根节点集合,默认根的parentId为null
     *
     * @param nodes 节点数据
     * @return List<TreeDTO>
     */
    public static <T extends TreeDTO> List<T> getRoots(List<T> nodes) {
        List<T> level1 = new ArrayList<>();
        if (null != nodes && nodes.size() > 0) {
            for (T node : nodes) {
                if (null == node.getParentId()) {
                    level1.add(node);
                }
            }
        }
        return level1;
    }

    /**
     * 查询根节点集合,默认根的parentId为null
     *
     * @param nodes 节点数据
     * @return List<TreeDTO>
     */
    public static <T extends TreeDTO> List<T> getRoots(List<T> nodes,String rootParentId) {
        List<T> level1 = new ArrayList<>();
        if (null != nodes && nodes.size() > 0) {
            for (T node : nodes) {
                if (rootParentId.equals(node.getParentId())) {
                    level1.add(node);
                }
            }
        }
        return level1;
    }

    /**
     * 找到子部门
     *
     * @param nodes
     * @param parentId
     * @return
     */
    public static <T extends TreeDTO> List<T> getChildrenByParentId(List<T> nodes, String parentId) {
        List<T> children = new ArrayList<>();
        if (null != nodes && nodes.size() > 0) {
            for (T node : nodes) {
                if (null != node.getParentId() && node.getParentId().equals(parentId)) {
                    children.add(node);
                }
            }
        }
        return children;
    }


    /**
     * 循环添加子节点(即子节点下面添加子节点)
     *
     * @param nodes  节点池
     * @param parent 父节点
     * @return
     */
    public static <T extends TreeDTO> T addChildren(List<T> nodes, T parent) {
        if (null != parent) {
            List<T> children = getChildrenByParentId(nodes, parent.getId());
            parent.setChildren(children);
            if (null != parent.getChildren() && parent.getChildren().size() > 0) {
                for (T child : (List<T>) parent.getChildren()) {
                    addChildren(nodes, child);
                }
            }
        }
        return parent;
    }

    //从所传的节点中获取构造出一颗树
    public static<T extends TreeDTO> List<T> findTree(List<T> nodes){
        List<T> roots = TreeDTOUtil.getRoots(nodes);
        if (null != roots && roots.size() > 0) {
            for (int i = 0; i < roots.size(); i++) {
                T d = (T) roots.get(i);
                TreeDTOUtil.addChildren(nodes, d);
            }
        }
        return roots;
    }

    //从所传的节点中获取构造出一颗树,制定rootParentId
    public static<T extends TreeDTO> List<T> findTree(List<T> nodes,String rootParentId){
        List<T> roots = TreeDTOUtil.getRoots(nodes,rootParentId);
        if (null != roots && roots.size() > 0) {
            for (int i = 0; i < roots.size(); i++) {
                T d = (T) roots.get(i);
                TreeDTOUtil.addChildren(nodes, d);
            }
        }
        return roots;
    }

    /**
     * 获取树某个节点数据
     *
     * @param treeDTO
     * @param searchId
     * @param <T>
     * @return
     */
    public static <T extends TreeDTO> T getChildFromChildId(T treeDTO, String searchId) {
        List<T> container = new ArrayList<>();
        getNodeFromTreeDTO(treeDTO, container);
        if (null != searchId) {
            for (T t : container) {
                if (t.getId().equals(searchId)) {
                    return t;
                }
            }
        }
        return null;
    }


    public static <T extends TreeDTO> List<T> getNodeFromTreeDTO(T treeDTO, List<T> container) {
        if (null == treeDTO || null == container) {
            return null;
        }
        container.add(treeDTO);
        for (T t : (List<T>) treeDTO.getChildren()) {
            getNodeFromTreeDTO(t, container);
        }
        return container;
    }

    /**
     * 将散乱的子节点构成一颗树
     * @param nodes
     * @param <T>
     * @return
     */
    public static <T extends TreeDTO> List<T> getTreeByNodes(List<T> nodes) {
        List<T> roots = TreeDTOUtil.getRoots(nodes);
        if (null != roots && roots.size() > 0) {
            for (int i = 0; i < roots.size(); i++) {
                T d =  roots.get(i);
                TreeDTOUtil.addChildren(nodes, d);
            }
        }
        return roots;
    }

    /**
     * 将树状的节点都放到map中
     * @param treeList
     * @param <T>
     * @return
     */
    public static <T extends TreeDTO> Map<String,T> getNodesMapFromTreeList(List<T> treeList){
        if(null == treeList || treeList.size() == 0){
            return new HashMap<String, T>();
        }
        List<T> container = new ArrayList<T>();
        Map<String,T> mapContainer = new HashMap<String, T>();
        //将所有的节点都放到容器中
        for(T t: treeList){
            getNodeFromTreeDTO(t, container);
        }
        for(T t : container){
            mapContainer.put(t.getId(),t);
        }
        return mapContainer;
    }

    public static <T extends TreeDTO> List<T> getNodesByIds(List<T> treeList,List<String> ids){
        if(null == ids || ids.size() == 0){
            return new ArrayList<>();
        }
        Map<String,T> nodesMap = getNodesMapFromTreeList(treeList);
        List<T> list = ids.stream().map(nodesMap::get).collect(Collectors.toList());
        return list;
    }


    /**
     * 根据节点递归回去其父级和父父级...
     * @param map
     * @param node
     * @param container
     * @param <T>
     * @return
     */
    public static <T extends TreeDTO> List<T> getRecursionParentFromMapNodes(Map<String,T> map,T node,List<T> container){
        if(null == map || map.size() == 0 || null == node || null == container){
            return null;
        }
        container.add(node);
        T parentNode = map.get(node.getParentId());
        if(null != parentNode){
            getRecursionParentFromMapNodes(map,parentNode,container);
        }
        return container;
    }

    /**
     * 根据节点集合递归回去其父级和父父级...集合
     * @param map
     * @param childrenNodes
     * @param <T>
     * @return
     */
    public static <T extends TreeDTO> List<T> getRecursionParentFromMapNodes(Map<String,T> map,List<T> childrenNodes){
        if(null == childrenNodes){
            return null;
        }
        List<T> container = new ArrayList<T>();
        for(T node : childrenNodes){
            getRecursionParentFromMapNodes(map,node,container);
        }
        // 过滤去重
        List<String> ids = new ArrayList<>();
        container = container.stream().filter(
                v -> {
                    boolean flag = !ids.contains(v.getId());
                    ids.add(v.getId());
                    return flag;
                }
        ).collect(Collectors.toList());
        return container;
    }

    /**
     * 从树状集合中，根据节点集合递归回去其父级和父父级...集合
     * @param treeList
     * @param childrenNodes
     * @param <T>
     * @return
     */
    public static <T extends TreeDTO> List<T> getRecursionParentFromChildrenNodes(List<T> treeList,List<T> childrenNodes){
        Map<String,T> map  = getNodesMapFromTreeList(treeList);
        return getRecursionParentFromMapNodes(map,childrenNodes);
    }

    /**
     * 从树状集合中，根据节点id集合递归回去其父级和父父级...集合
     * @param treeList
     * @param childrenIds
     * @param <T>
     * @return
     */
    public static <T extends TreeDTO> List<T> getRecursionParentFromChildrenIds(List<T> treeList,List<String> childrenIds){
        List<T> childrenNodes = getNodesByIds(treeList,childrenIds);
        return getRecursionParentFromChildrenNodes(treeList,childrenNodes);
    }
}
