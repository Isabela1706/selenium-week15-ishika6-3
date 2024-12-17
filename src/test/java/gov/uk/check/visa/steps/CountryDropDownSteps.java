package gov.uk.check.visa.steps;

import io.cucumber.java.en.Then;
import io.cucumber.datatable.DataTable;

import java.util.List;

public class CountryDropDownSteps {
    @Then("I can see following country into dropdown")
    public void iCanSeeFollowingCountryIntoDropdown(DataTable dataTable) {
        List<List<String>> country = dataTable.asLists(String.class);
        for (List<String> list : country) {
            System.out.println(list);
        }
    }
}
