package Java.grundlagen.j6.annotations;

import javax.annotation.processing.AbstractProcessor;
import javax.annotation.processing.RoundEnvironment;
import javax.annotation.processing.SupportedAnnotationTypes;
import javax.annotation.processing.SupportedSourceVersion;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.Element;
import javax.lang.model.element.TypeElement;
import java.util.Arrays;
import java.util.Set;

@SupportedAnnotationTypes({"Java.grundlagen.j6.annotations.Excercise1"})
@SupportedSourceVersion(SourceVersion.RELEASE_8)
public class DocumentationProcessor extends AbstractProcessor {

    @Override
    public boolean process(Set<? extends TypeElement> annotations, RoundEnvironment roundEnv) {
        try {
            for (TypeElement annotation : annotations) {
                Set<? extends Element> annotatedElements = roundEnv.getElementsAnnotatedWith(annotation);
                for (Element element : annotatedElements) {
                    Excercise1 annotation1 = element.getAnnotation(Excercise1.class);
                    Class<?> clazz = Class.forName("Java.grundlagen.j6.annotations.Excercise2");
                    System.out.println(clazz);
                    System.out.println("------");
                    System.out.println(Arrays.toString(annotation1.authors()) + ", " + annotation1.description());
                    System.out.println(annotation1.version());
                }
            }
        } catch (
                ClassNotFoundException e) {
            System.out.println(e);
        }
        return false;
    }
}