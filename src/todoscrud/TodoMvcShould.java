package todoscrud;

import org.junit.*;
public class TodoMvcShould {

    private static final String SOME_RANDOM_NAME = "some random name";

    private BusinessSteps businessSteps;
    @Test

    public void beAbleToAddNewItem() {

        businessSteps.navigateToHomePage();
        businessSteps.createNewTodoItem(SOME_RANDOM_NAME);
        businessSteps.assertItemWasCreated(SOME_RANDOM_NAME);
    }

    @Test

    public void beAbleToMarkItemComplete() {
// comment here
    }

    {
        // Arrange
        businessSteps.navigateToHomePage();
        businessSteps.createNewTodoItem(SOME_RANDOM_NAME);

        //Act
        businessSteps.markItemComplete(SOME_RANDOM_NAME);

        //Assert
        businessSteps.assertItemComplete(SOME_RANDOM_NAME);
    }


}
