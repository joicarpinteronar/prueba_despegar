package com.despegar.automation.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.targets.Target;

public class ValidateInformationText implements Question<String> {

    Target element;

    public ValidateInformationText(Target element) {
        this.element = element;
    }

    public static ValidateInformationText validateInformationText(Target element) {
        return new ValidateInformationText(element);
    }

    @Override
    public String answeredBy(Actor actor) {
        String labelField = Text.of(element).viewedBy(actor).asString();
        return labelField;
    }
}
