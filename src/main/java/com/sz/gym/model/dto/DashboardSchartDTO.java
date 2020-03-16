package com.sz.gym.model.dto;

import java.util.List;

/**
 * @ClassNameDashboardSchart
 * @Description TODO
 * @Author zhen.zhen
 * @Date 2020/3/1612:45
 * @Version 1.0
 */
public class DashboardSchartDTO {

    /**
     * type : bar
     * title : {"text":"最近三天健身房财务状况"}
     * xRorate : 25
     * labels : ["周一","周二","周三","周四","周五","周六"]
     * datasets : [{"label":"家电","data":[234,278,270,190,230]},{"label":"百货","data":[164,178,190,135,160]},{"label":"食品","data":[144,198,150,235,120]}]
     */

    private String type;
    private TitleBean title;
    private int xRorate;
    private List<String> labels;
    private List<DatasetsBean> datasets;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public TitleBean getTitle() {
        return title;
    }

    public void setTitle(TitleBean title) {
        this.title = title;
    }

    public int getXRorate() {
        return xRorate;
    }

    public void setXRorate(int xRorate) {
        this.xRorate = xRorate;
    }

    public List<String> getLabels() {
        return labels;
    }

    public void setLabels(List<String> labels) {
        this.labels = labels;
    }

    public List<DatasetsBean> getDatasets() {
        return datasets;
    }

    public void setDatasets(List<DatasetsBean> datasets) {
        this.datasets = datasets;
    }

    public static class TitleBean {
        /**
         * text : 最近一周健身房财务状况
         */

        private String text;

        public String getText() {
            return text;
        }

        public void setText(String text) {
            this.text = text;
        }
    }

    public static class DatasetsBean {
        /**
         * label : 家电
         * data : [234,278,270,190,230]
         */

        private String label;
        private List<Integer> data;

        public String getLabel() {
            return label;
        }

        public void setLabel(String label) {
            this.label = label;
        }

        public List<Integer> getData() {
            return data;
        }

        public void setData(List<Integer> data) {
            this.data = data;
        }
    }
}
