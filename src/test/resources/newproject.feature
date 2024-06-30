Feature: Admin panel CouponEditSection
  As a part of e-commerce department,
  I want to edit the coupon feature
  and be flexible engaging it by myself
  editing timing and enabling it
@regression
 Scenario: Log in Admin panel
   Given the user is in admin panel portal
   When he apply their credentials
   And the user goes in Marketing section in Navigation Bar
   And the user get in the Coupons section
   And choose Free shipping coupon and click to edit it
   And choose proper date as a final date
   And change the status to enable
   And save the changes
   Then there is a alert on the screen as a successful operation

