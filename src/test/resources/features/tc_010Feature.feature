Feature: Generación y almacenamiento de Slip de salida

  Scenario: Validar generación de 'Slip de salida' y almacenamiento en historial
    Given el usuario está en la página de carga de documentos
    When completa la carga y procesamiento de documentos
    Then el sistema genera el 'Slip de salida'
    And guarda los documentos originales y datos extraídos en el historial de la solicitud