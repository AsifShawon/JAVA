package Alpha3;
public abstract class Question {
    private static String[] que = {"_PPLE","HAP_Y","BA_ANA","CAN__","BI__CLE","COCO__T",
            "FL___R","MONO___Y", "KITC___", "C___OLATE"};
    private static String[] ans = {"A","P","N","DY","CY","NU","OWE","POL","HEN","HOC"};

    public static String getQue(int i) {
        return que[i];
    }

    public static String getAns(int i) {
        return ans[i];
    }
} 
