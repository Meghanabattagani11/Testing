Feature: Swiggy Order Process

Scenario: A User must be able to order items to the cart on Swiggy
Given a user is on the landing page of swiggy
When he type "Hyderabad" as my delivery location and select the first option
And he clicks on the first restaurant shown under "Top restaurant chains in Hyderabad"
And he clicks on the "Add" button corresponding to the first listed dish
And he hover over the "Cart" in the top right corner
And he clicks on "Check Out" in the sub-menu
Then he verifies that the text "To place your order now, log in to your existing account or sign up." is visible on the next page
And he close the browser