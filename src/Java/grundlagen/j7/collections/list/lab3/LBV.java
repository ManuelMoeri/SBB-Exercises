package Java.grundlagen.j7.collections.list.lab3;

public class LBV {

    private float grade;
    private float weighting;

    public LBV(float grade, float weighting) {
        this.grade = grade;
        this.weighting = weighting;
    }

    public float getGrade() {
        return grade;
    }

    public float getWeighting() {
        return weighting;
    }

    public static final LBV JavaLBV1 = new LBV(5.0f, 0.25f);
    public static final LBV JavaLBV2 = new LBV(4.5f, 0.75f);
    public static final LBV HTMLLBV1 = new LBV(4.0f, 0.5f);
    public static final LBV HTMLLBV2 = new LBV(5.0f, 0.5f);
    public static final LBV CSSLBV1 = new LBV(4.0f, 0.4f);
    public static final LBV CSSLBV2 = new LBV(4.5f, 0.6f);

    public static void main(String[] args) throws ModulNotGradeableException {
        Module.JavaModule.addLBV(JavaLBV1);
        Module.JavaModule.addLBV(JavaLBV2);
        Module.HTMLModule.addLBV(HTMLLBV1);
        Module.HTMLModule.addLBV(HTMLLBV2);
        Module.CSSModule.addLBV(CSSLBV1);
        Module.CSSModule.addLBV(CSSLBV2);
        Module.JavaModule.getFinalModuleGrade();
    }
}
