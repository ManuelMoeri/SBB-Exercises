package Java.grundlagen.j7.collections.list;

import java.util.ArrayList;
import java.util.List;

public class Module {

    private String moduleName;

    public Module(String moduleName) {
        this.moduleName = moduleName;
    }

    public static final Module JavaModule = new Module("Java");
    public static final Module HTMLModule = new Module("HTML");
    public static final Module CSSModule = new Module("CSS");

    public List<LBV> modulGrades = new ArrayList<>();

    public void addLBV(LBV exam) {
        modulGrades.add(exam);
    }

    public float getFinalModuleGrade() throws ModulNotGradeableException {
        float resultJava;
        float resultHTML;
        float resultCSS;

        if (LBV.JavaLBV1.getWeighting() + LBV.JavaLBV2.getWeighting() == 1 || LBV.HTMLLBV1.getWeighting() + LBV.HTMLLBV2.getWeighting() == 1 || LBV.CSSLBV1.getWeighting() + LBV.CSSLBV2.getWeighting() == 1) {
            float gradeTimesWeightJava1 = LBV.JavaLBV1.getGrade() * LBV.JavaLBV1.getWeighting();
            float gradeTimesWeightJava2 = LBV.JavaLBV2.getGrade() * LBV.JavaLBV2.getWeighting();
            resultJava = gradeTimesWeightJava1 + gradeTimesWeightJava2;

            float gradeTimesWeightHTML1 = LBV.HTMLLBV1.getGrade() * LBV.HTMLLBV1.getWeighting();
            float gradeTimesWeightHTML2 = LBV.HTMLLBV2.getGrade() * LBV.HTMLLBV2.getWeighting();
            resultHTML = gradeTimesWeightHTML1 + gradeTimesWeightHTML2;

            float gradeTimesWeightCSS1 = LBV.CSSLBV1.getGrade() * LBV.CSSLBV1.getWeighting();
            float gradeTimesWeightCSS2 = LBV.CSSLBV2.getGrade() * LBV.CSSLBV2.getWeighting();
            resultCSS = gradeTimesWeightCSS1 + gradeTimesWeightCSS2;

            printReportEntry(resultJava, resultHTML, resultCSS);
        } else {
            throw new ModulNotGradeableException("The sum of the weightings doesn't equal 1");

        }
        return resultJava + resultHTML + resultCSS;
    }

    public void printReportEntry(float resultJava, float resultHTML, float resultCSS) {
        System.out.println("Java : " + resultJava);
        System.out.println("HTML : " + resultHTML);
        System.out.println("CSS : " + resultCSS);
    }
}
