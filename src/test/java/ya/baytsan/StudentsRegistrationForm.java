package ya.baytsan;


import org.junit.jupiter.api.Test;



import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;



public class StudentsRegistrationForm {

 @Test
 void demoTest() {
  open("https://demoqa.com/automation-practice-form");
  $(".practice-form-wrapper").shouldHave(text("Student Registration Form"));
  $("#firstName").setValue("Alex");
  $("#lastName").setValue("Egorov");
  $("#userEmail").setValue("alex@egorov.com");

  // $("[for=gender-radio-1]").click();
  $("#genterWrapper").$(byText("Male")).click();
  $("#userNumber").setValue("1263777443");
  $("#dateOfBirthInput").click();
  $(".react-datepicker__month-select").selectOption("July");
  $(".react-datepicker__year-select").selectOption("2005");
  $(".react-datepicker__day--030:not(.react-datepicker__day--outside-month)").click();
  //react-datepicker__day react-datepicker__day--030 react-datepicker__day--selected react-datepicker__day--outside-month
  //react-datepicker__day react-datepicker__day--030 react-datepicker__day--weekend


  $("#subjectsInput").setValue("maths").pressEnter();
  $("#hobbiesWrapper").$(byText("Sports")).click();
  // $("#uploadPicture").uploadFile(new File("src/test/resources/img/1.png"));
  $("#uploadPicture").uploadFromClasspath("img/1.png");
  $("#currentAddress").setValue("gdhj").pressEnter().scrollTo();
  $("#state").click();
  $("#stateCity-wrapper").$(byText("NCR")).click();
  $("#city").click();
  $("#stateCity-wrapper").$(byText("Delhi")).click();
  $("#submit").click();
  $("#example-modal-sizes-title-lg").shouldHave(text("Thanks for submitting the form"));
  $(".table-responsive").shouldHave(text("alex@egorov.com"));
  $(".table-responsive").$(byText("Student Name")).parent().shouldHave(text("Alex Egorov"));

 }
}















