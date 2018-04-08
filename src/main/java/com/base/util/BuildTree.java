package com.base.util;

import java.util.ArrayList;
import java.util.List;

import com.base.model.ZtreeVO;

public class BuildTree {
    public static <T> List<ZtreeVO<T>> build(List<ZtreeVO<T>> nodes) {

        if (nodes == null) {
            return null;
        }
        List<ZtreeVO<T>> topNodes = new ArrayList<ZtreeVO<T>>();

        for (ZtreeVO<T> children : nodes) {

            Integer pid = children.getpId();
            if (pid.equals(children.getId() ) || pid == 0) {
                topNodes.add(children);
                continue;
            }
            for (ZtreeVO<T> parent : nodes) {
            	Integer id = parent.getId();
                if (id != null && id.equals(pid)) {
                    parent.getChildren().add(children);
                }
            }
        }
        return topNodes;
    }


}