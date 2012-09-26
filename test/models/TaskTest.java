package models;


import org.fest.assertions.Assertions;
import org.junit.Test;


public class TaskTest extends BaseModelTest{

    @Test
    public void createTest() {
        Task t = new Task("My Company");
        Task.create(t);

        Assertions.assertThat(t.id).isNotNull();
    }

    @Test
    public void countTest() {
        Assertions.assertThat(Task.count()).isEqualTo(0);

        Task company = new Task("My Company");
        Task.create(company);

        Assertions.assertThat(Task.count()).isEqualTo(1);
    }

}
