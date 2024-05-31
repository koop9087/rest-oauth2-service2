Чтобы запустить проект вводим в командную строку docker-compose up --build
Генерируем JWT Token по ссылке http://localhost:8080/realms/agsr/protocol/openid-connect/token
![Screenshot_15](https://github.com/koop9087/rest-oauth2-service2/assets/77532145/5d4d4f81-7ea2-4a1f-a3ad-af0632b8c228)



Я приложил коллекцию постман ее нужно импортировать и пользоваться

Далее, идем по эндпоинтам

GET http://localhost:8081/agsr/api/patients/{id}

POST http://localhost:8081/agsr/api/patients

DELETE http://localhost:8081/agsr/api/patients/{id}

PUT http://localhost:8081/agsr/api/patients/{id}

Важное дополнение, вставлять токен придется при каждом новом запросе (если работать в постмане,
следует вставить на 7 шагов токен и пользоваться, не хватило времени вставить переменную)

!!! Входные данные - Роль - Практикант

Сохраняем пациентов
![Screenshot_6](https://github.com/koop9087/rest-oauth2-service2/assets/77532145/d5fb2042-5ec0-4adf-a819-9403eb9612d1)

![Screenshot_7](https://github.com/koop9087/rest-oauth2-service2/assets/77532145/698710f3-260b-41b0-a55a-9acb184d49c9)

![Screenshot_8](https://github.com/koop9087/rest-oauth2-service2/assets/77532145/5fb9a1d1-50b7-491f-a92b-f12291df0329)


Смотрим, какие теперь есть в базе пациенты
![Screenshot_9](https://github.com/koop9087/rest-oauth2-service2/assets/77532145/f12125d9-b2f0-4adc-b112-76085ae349cf)


Обновляем пациента
![Screenshot_10](https://github.com/koop9087/rest-oauth2-service2/assets/77532145/dd1796b5-4f1c-4a28-90c2-2fdfa19ec01c)


Проверяем на обновление (Изменилось имя и фамилия)
![Screenshot_11](https://github.com/koop9087/rest-oauth2-service2/assets/77532145/33024587-5d15-45df-a527-6829bf8e8143)


Удаляем пациента (я взял по id 3, для удобства тестирования писал id 1 2 3,
конечно можно и другой туда подставить)
![Screenshot_12](https://github.com/koop9087/rest-oauth2-service2/assets/77532145/3ea0cfb0-34ff-4a38-b67c-28d4c97b66a2)


Смотрим, удалился ли пациент
![Screenshot_13](https://github.com/koop9087/rest-oauth2-service2/assets/77532145/cc18b47c-9115-4ef8-a133-3a457d6c0cec)


Входные данные - Роль - Пациент (В коллекции постмана написано какие креды вставлять)

![Screenshot_14](https://github.com/koop9087/rest-oauth2-service2/assets/77532145/708d3b6c-38d9-41ac-9818-ce31b95b0191)


Смотрим, какие пациенты есть

![Screenshot_14_role](https://github.com/koop9087/rest-oauth2-service2/assets/77532145/4b4b41ed-cca9-4f9a-9246-0c39468ac67d)


Сохранить пациента не можем (403)

![Screenshot_14_roles](https://github.com/koop9087/rest-oauth2-service2/assets/77532145/b96ffcf3-521e-443a-a4ef-b96be9362345)


Аналогично с обновлением и удалением пациента

![Screenshot_14_roles1](https://github.com/koop9087/rest-oauth2-service2/assets/77532145/d57069b5-3928-4b45-8d43-334dff4ac7cb)

![Screenshot_14_roles2](https://github.com/koop9087/rest-oauth2-service2/assets/77532145/63ebdbee-279f-4c10-b192-34a863588834)



Дальшее запускаем класс EntityCreateTask.class из пакета task

![Screenshot_16](https://github.com/koop9087/rest-oauth2-service2/assets/77532145/2b59a247-172d-402b-b0b9-02e4068868b0)



