Meta:


Scenario: Авторизация с некорректным логином (параметризованный)

Given открыта главная страница
When выполнен переход к странице авторизации
When выполнена авторизация с логином <login>
Then сообщение об ошибке равно "<expected>"

Examples:
|login|expected|
|test|Не удалось распознать адрес электронной почты.|
|test1|Не удалось распознать адрес электронной почты.|