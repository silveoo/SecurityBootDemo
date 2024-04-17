# Postman CRUD
## Возможности
- Чтение, создание, обновление и удаление студентов из базы данных Postgres (Spring Data JPA).
- Поиск студентов по Email.
- Авторизация (Spring Security), система ролей ROLE_ADMIN, ROLE_USER, шифрование пароля.
- Создание пользователей с помощью Postman.
## Установка
В проекте используется Java 17. Создайте базу данных PostgreSQL и в файле application.yaml замените url, username, password на данные своей базы.
Запустите jar файл командой:
```
java -jar Demo.jar
```
Стандартные значения: 
```
url: jdbc:postgresql://localhost:5432/students
username: postgres
password: root
```
## Методы
Все методы начинаются с localhost:8080/api/v1/
| URL | Метод | Назначение |
| --- | --- | --- |
| students/welcome | GET | Приветственная страница |
| students/show | GET | Список всех студентов |
| students/{email} | GET | Поиск студентов по Email |
| students/save_student | POST | Добавить студента |
| students/update_student | UPDATE | Редактировать студента |
| students/delete_student | DELETE | Удалить студента |
| students/users/new-user | POST | Новый пользователь |
