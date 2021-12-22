package hw12Selenium;

public class Dynamic_XPath {

	
	/* Different ways to create dynamic XPath:

1.	Tag with a single attribute (Mostly used)

Formula: //htmltag[@attributeName='attributeValue']

Source: https://www.cvs.com/
Example:
a)	Shop all categories: //div[@class='css-901oao r-1awozwy r-cqee49 r-1jn44m2 r-1b43r93 r-vw2c0b r-1h0z5md']
b)	CVS-Home-Beauty Button: //h1[@class='css-4rbku5 css-901oao r-cqee49 r-1ui5ee8 r-vw2c0b r-16krg75 r-xnfwke r-crgep1 r-t60dpp']
c)	Choose a store: //div[@class='css-1dbjc4n r-1awozwy r-18u37iz r-1777fci']
d)	My orders: //div[@class='css-1dbjc4n r-18u37iz r-17s6mgv']
e)	Contact lenses: //meta[@name='description']

2.	Tag with multiple attributes with “or” logic
Formula: //html tag [@attribute name = 'attribute value' or @attribute name = 'attribute value']

Source: https://www.cvs.com/

Example:

a)	Minute clinic see locations: //input[@class='form-control ng-pristine ng-invalid ng-touched' or @id='zip']
b)	Minute clinic in person visit: //a[@id='clinic-visit' or @class='p-left-20']
c)	In person service see locations: //input[@id='find-clinic' or @name='search']
d)	Aetnahealth pay your bill: //input[@class='fe_c_input__input' or @type='text']
e)	Signup for email newsletter: //input[@id='newsletter' or @name='email']


3.	Tag with Multiple attributes with “and” logic

Formula: //html tag [@attribute name = 'attribute value' and @attribute name = 'attribute value']
Source: https://www.cvs.com/
Example: 
a)	Email healthier happens together: //input[@id='userEmail' and @class='ng-pristine ng-invalid ng-touched']
b)	Prescription refill identify pharmacy city: //input[@id='externalPharamcy_city' and @class='form-control ng-pristine ng-valid ng-touched']
c)	Zip code: //input[@class='form-control ng-pristine ng-valid ng-touched' and @id='externalPharamcy_Zip']
Source: https://www.walgreens.com/
d)	Search field: //input[@class='blue-shadow' and @name='Ntt']
e)	Search keyword: //input[@id='ntt-placeholder' and @name='Ntt']

4.	Tag with inner text (means complete text)
Formula: //html tag [text() = 'inner text value' ]
Source: https://www.walgreens.com/
Example:
a)	HealthHUB: //a[text()='HealthHUB']
b)	Shop: //a[text()='Shop']
c)	Optical: //a[text()='Optical']
d)	Shop Photo: //a[text()='Shop Photo']
e)	Mycvs: //a[text()='CVS pharmacy™ homepage']

5.	Tag with inner text [not actual text, means partial text as well as actual text] (most commonly used)
Formula: //html tag [contains(text(), 'partial or complete inner text value') ]
Source: https://www.cvs.com/
Example:
a)	Beauty: //h1[contains(text(),'Beauty')]
b)	Health and medicine: //h1[contains(text(), 'Health & Medicine')]
c)	Allergy and Asthma: //h1[contains(text(), 'Allergy & Asthma')]
d)	Braces and Support: //h1[contains(text(), 'Braces & Supports')]
e)	Sleeping and snoring Aids: //h1[contains(text(), 'Sleep & Snoring Aids')]

6. Tag with attributes and use of contains (not commonly used)
Formula: //html tag [contains(@attribute, 'attribute value') ]
Source: https://www.cvs.com/
Example:
a)	Your Vaccine…….: //h1[contains(@class, 'acn-mob-padding acn-header-new')]
b)	Sign in button: //a[contains(@id, 'signInBtn')]
c)	Create account button: //a[contains(@class, 'my-cvs')]
d)	Store locator: //a[contains(@class, 'head-links')]
e)	CVS Photo: //img[contains(@class, 'cvs-logo')]

      7. Normalize space -- eliminates leading and trailing spaces. (high level)

Formula: //html tag [normalize-space(text())='attribute value']
Example: 

      8.  Starts with text

Formula: //html tag [starts-with(text(), 'attribute value')]
Example: 
      9.  Starts with attribute (not commonly used, no need to practice it)

Formula: //html tag [starts-with(@attributes, 'attribute value']
Example:
 
 

  */
}
