Meta:


Scenario: Авторизация с некорректным логином

Given открыта главная страница
When выполнен переход к странице авторизации
When выполнена авторизация с логином test
Then сообщение об ошибке равно "Не удалось распознать адрес электронной почты."