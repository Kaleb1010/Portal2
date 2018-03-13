package LoginFrontPage;

public enum option {
    student,Faculty;

    option() {}

    private String Value(){
        return name();
    }

    public static  option Fromvalue(String v){
        return valueOf(v);
    }



}
