package com.kelab.info.base;

public class JsonAndModel {
    private Object data;
    private String access_token;
    private String code;

    public Object getData() {
        return data;
    }

    public String getAccess_token() {
        return access_token;
    }

    public String getCode() {
        return code;
    }

    public static JsonAndModel.Builder builder(String code) {
        JsonAndModel.Builder builder = new JsonAndModel.Builder();
        builder.setCode(code);
        return builder;
    }

    private JsonAndModel(JsonAndModel.Builder builder) {
        this.data = builder.getData();
        this.access_token = builder.getAccess_token();
        this.code = builder.getCode();
    }

    public static class Builder {
        private Object data = null;
        private String access_token = null;
        private String code = null;

        public Object getData() {
            return data;
        }

        public String getAccess_token() {
            return access_token;
        }

        public String getCode() {
            return code;
        }

        public JsonAndModel.Builder code(String code) {
            this.code = code;
            return this;
        }

        public JsonAndModel.Builder token(String access_token) {
            this.access_token = access_token;
            return this;
        }

        public JsonAndModel.Builder data(Object data) {
            this.data = data;
            return this;
        }

        public JsonAndModel build() {
            return new JsonAndModel(this);
        }

        public Builder() {
        }

        public void setData(Object data) {
            this.data = data;
        }

        public void setAccess_token(String access_token) {
            this.access_token = access_token;
        }

        public void setCode(String code) {
            this.code = code;
        }
    }

    public JsonAndModel() {
    }


}
