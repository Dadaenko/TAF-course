package todoscrud;

public interface BusinessSteps {

    void navigateToHomePage();
    void createNewTodoItem(String someRandomName);
    void assertItemWasCreated(String someRandomName);
    void markItemComplete(String someRandomName);
    void assertItemComplete(String someRandomName);

}
