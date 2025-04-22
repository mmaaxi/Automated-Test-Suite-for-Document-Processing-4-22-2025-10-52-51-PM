Feature: Validate file upload with valid format and preview

  Scenario: Validating PDF/DOCX file upload within 50 MB limit
    Given the user is on the file upload page
    When the user selects a valid PDF/DOCX file within 50 MB size
    Then the file should be uploaded successfully
    And the file preview should display the name, size, and type of the file