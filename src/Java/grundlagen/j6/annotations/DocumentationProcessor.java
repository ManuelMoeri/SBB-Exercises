package Java.grundlagen.j6.annotations;

import javax.annotation.processing.AbstractProcessor;
import javax.annotation.processing.RoundEnvironment;
import javax.annotation.processing.SupportedAnnotationTypes;
import javax.annotation.processing.SupportedSourceVersion;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.Element;
import javax.lang.model.element.TypeElement;
import java.util.Set;

@SupportedAnnotationTypes({"Java.grundlagen.j6.annotations.Excercise1"})
@SupportedSourceVersion(SourceVersion.RELEASE_8)
public class DocumentationProcessor extends AbstractProcessor {

    @Override
    public boolean process(Set<? extends TypeElement> annotations, RoundEnvironment roundEnv) {
        for(TypeElement annotation:annotations){
            Set<?extends Element> annotatedElements = roundEnv.getElementsAnnotatedWith(annotation);
            for(Element element:annotatedElements) {
                Excercise1 annotation1 = element.getAnnotation(Excercise1.class);
            }
        }
        return false;
    }
}