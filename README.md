Чтобы запустить проект вводим в командную строку docker-compose up --build
Генерируем JWT Token по ссылке http://localhost:8080/realms/agsr/protocol/openid-connect/token



Я приложил коллекцию постман ее нужно импортировать и пользоваться

Далее, идем по эндпоинтам

GET http://localhost:8081/agsr/api/patients/{id}

POST http://localhost:8081/agsr/api/patients

DELETE http://localhost:8081/agsr/api/patients/{id}

PUT http://localhost:8081/agsr/api/patients/{id}

Важное дополнение, вставлять токен придется при каждом новом запросе (если работать в постмане,
следует вставить на 7 шагов токен и пользоваться, не хватило времени вставить переменную)

Входные данные - Роль - Практикант

Сохраняем пациентов


Смотри, какие теперь есть в базе пациенты


Обновляем пациента


Проверяем на обновление (Изменилось имя и фамилия)


Удаляем пациента (я взял по id 3, для удобства тестирования писал id 1 2 3,
конечно можно и другой туда подставить)


Смотрим, удалился ли пациент


Входные данные - Роль - Пациент (В коллекции постмана написано какие креды вставлять)

Смотрим какие пациенты есть


Сохранить пациента не можем (403)


Аналогично с обновлением и удалением пациента

Дальшее запускаем класс EntityCreateTask из пакета task




