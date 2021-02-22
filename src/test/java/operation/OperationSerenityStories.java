package operation;

import net.serenitybdd.jbehave.SerenityStories;

public class OperationSerenityStories extends SerenityStories {

    public OperationSerenityStories() {
        runSerenity().inASingleSession();
    }
}
