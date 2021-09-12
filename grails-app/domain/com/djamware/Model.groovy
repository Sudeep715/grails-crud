package com.djamware

class Model {

    String name
    static belongsTo = [make: Make]

    static constraints = {
    }

    @Override
    public String toString() {
        return "Model{" +
                "name='" + name + '\'' +
                ", belongsTo=" + belongsTo +
                '}';
    }
}
