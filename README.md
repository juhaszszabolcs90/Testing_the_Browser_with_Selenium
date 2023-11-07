## Practice: Testing the Browser
Now let's start the fun (coding) part! Your mission is to automate the following tests.

First rule: Create every testcase with capture and replay first, then implement with webdriver, and compare your results. Second rule: In webdriver, try to create future-proof solutions (expect changes in webpages). Be prepared for average changes on the webpage. Third rule: Do not use the mouse in your exercises. You should not see the cursor move around while the tests are running.

Use your prefered IDE and the following tools: java, maven, junit, selenium webdriver

### First exercise - Navigation:

Open the base url. Using the "Menu List" navigate to All Examples/Input Forms/Simple Form Demo
Base url: https://www.seleniumeasy.com/test/
That's it.
Make sure that you click on visible menu items.

### Second exercise - Single field & Button:

Navigate to Simple Form Demo. In "Single Input Field" enter a message into the field and click "Show Message" button. Validate that the message appeared.
Wasn't that hard, was it?

### Third exercise - Two fields & Output:

Navigate to Simple Form Demo. In "Two Input Fields" enter value A and B and click the "Get Total" button. Validate that the answer is correct.
Does your test works even when you enter very large numbers?

### Fourth exercise - Checkbox:

Navigate to Checkbox Demo. In "Single Checkbox Demo" check the checkbox and validate the message.
Bonus if you write a test for "Multiple Checkbox Demo" and find the bug which is present on the webpage.

### Fifth exercise - Select List:

Navigate to Select Dropdown List. In "Select List Demo" select the current day from the dropdown and validate that it's selected.
Try out all the way you can select a day.

### Sixth exercise - Radio Buttons:

Navigate to Radio buttons Demo. In "Group Radio Buttons Demo" select a combination and click the "Get values" button. Validate the result.
Try to run several combinations in one test.
If you finished all of it, congratulations! You can now try to automate date pickers and tables :)