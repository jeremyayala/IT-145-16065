/*  Developed by: Jeremy Ayala //
 *  Date: 03-05-25 //
 * Pet Check-In //
 The method for the pet check-in process should meet the following criteria:
•  Determine if the pet is a dog or cat and check for boarding space.
• There are 30 spaces for dogs and 12 for cats. Pet BAG must be able to adjust these counts as the
shop grows.
• If there is space for a new pet, collect the appropriate information. For returning pets, update
the information as needed.
• Gather information on the length of the stay.
• Determine if the pet owner would like the pet to be groomed. Only dogs can be groomed and
only if they stay two or more days.
• Assign the pet to a space.
 */

 START
  DISPLAY: WELCOME TO PET BAG GROOMING! PRESS TO START! // screen that displays when system is first started or in demo mode.
  PROMPT THE USER TO ENTER THEIR PHONE NUMBER
  USER INPUT of PHONE NUMBER
  IF PHONE NUMBER is in system:
    DISPLAY "Welcome back, <owner>"
    CONTINUE
  ELSE
    PROMPT "Please enter your first and last name."  
    INPUT : Owner first and last name
    CONTINUE
  
  PROMPT "Who would you like to check in today?"
  USER INPUT of pet's name
  IF PET NAME exists THEN
    IF PET TYPE = dog THEN
        IF DOG SPACES <= 0 THEN
            DISPLAY "There are currently no spots available for dogs! Please check back another day!"
            END
        ELSE IF DOG SPACES 0 > THEN
            CONTINUE
    ELSE IF PET TYPE = CAT THEN
        IF CAT SPACES <= 0 THEN
            DISPLAY "There are currently no spots available for cats! Please check back another day!"
            END
        ELSE IF CAT SPACES 0 >
            CONTINUE
  ELSE
    PROMPT "Is your pet a dog or cat?"
    USER INPUT of PET TYPE
        IF PET TYPE is "dog" THEN
            IF DOG SPACES <= 0 THEN
            DISPLAY "There are currently no spots available for dogs! Please check back another day!"
            END
        ELSE IF DOG SPACES 0 > THEN
            CONTINUE
        ELSE IF PET TYPE is CAT THEN
            IF CAT SPACES <= 0 THEN
            DISPLAY "There are currently no spots available for cats! Please check back another day!"
            END
        ELSE IF CAT SPACES 0 >
            CONTINUE

PROMPT "Please enter pet's breed"
    USER INPUT PET BREED

PROMPT "Please enter pet's age"
    USER INPUT PET AGE

PROMPT "Please enter length of stay"
    USER INPUT LENGTH OF STAY

IF PET TYPE = DOG THEN
    IF LENGTH OF STAY >= 2 THEN
        PROMPT "Would you like to include grooming?"
            IF YES
                SET GROOM to TRUE
            ELSE
                SET GROOM to FALSE

IF PET TYPE = DOG THEN
    ASSIGN ID to DOG SPACE ID
    DECREMENT DOG SPACE 
ELSE IF PET TYPE = CAT THEN
    ASSIGN ID to CAT SPACE ID
    DECREMENT CAT SPACE 
END IF

DISPLAY "Thank you for checking in at Pet BAG!"

END




