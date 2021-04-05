public enum TrafficLight {
    STOP("RED",60),
    GET_READY("YELLOW",5),
    G0("GREEN",50);


    private final int duration;
    private final String enumConstant;

    TrafficLight(String enumConstant,int duration) {
        this.enumConstant = enumConstant;
        this.duration = duration;
    }
    public String getEnumConstant(){
        return enumConstant;
    }
    public int getDuration(){
        return  duration;
    }

}
