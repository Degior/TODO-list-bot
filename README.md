# TODO-list-bot

### Таск 1:
1. Реализация todo списка:
-возможность создавать (/create Note),
-удалять заметку(/delete Note),
-добавлять в нее несколько задач(пока что только при создании заметки),
-получать список заметок(/getnotelist),
-смотреть на содержимое заметки (/onenote)
2. Реализация трекера привычек
-Добавить привычку(/addHabit)
-Удаление привычек(/removeHabit)
-Показать все привычки(/showHabit)
-Редактировать привычку(/editHabit)
-Пометить привычку выполненной(/markHabit)
### Таск 2:
1. Пуш уведомления трекера привычек
2. Сбор статистики
3. Возможность редактировать заметку(помечать задачу выполненной, удалять задачи из заметки, добавлять
задачи в заметку)
4. Подключение телеграмма

### Пример 1:

User: Начать

Telegram: Привет! Я бот, который поможет тебе сформировать полезные привычки и ввести список твоих дел.
Я буду напоминать тебе о твоих привычках и следить за твоими успехами.
Для начала работы со мной введи Помощь

User: Помощь

Telegram: Я умею показывать твои дела и привычки и добавлять новые
/help (Помощь)
вывести это сообщение
/getNotesList (Список заметок)
показать список заметок
/createNote (Добавить заметку)
добавить заметку на день
/deleteNote (Удалить заметку)
удалить заметку
/openNote (Открыть заметку)
открыть заметку
/addHabit (Добавить привычку)
добавить привычку
/removeHabit (Убрать привычку)
удалить привычку
/showHabit (Просмотреть привычки)
показать список привычек
/editHabit (Редактировать привычку)
редактировать привычку
/markHabit (Отметить выполнение)
отметить выполнение привычки

User: Добавить заметку

Telegram: Чтобы создать заметку, укажите дату в формате ДД/MM
(ДД ММ, ДД.ММ)

User: 27 05

Telegram: Теперь можешь внести в план на день несколько задач через Enter.

User: забрать посылку
Telegram:  Задача добавлена
User: навестить друзей
Telegram: Задача добавлена
User: помочь родителям
Telegram: Задача добавлена

User: Список заметок

Telegram: 2023-05-27

User: Открыть заметку

Telegram: Введите название заметки в формате даты.
Укажите дату в формате либо ДД/ММ (ДД ММ, ДД.ММ)

User: 26 05

Telegram: Такой заметки не существует. Можете попробовать еще раз

User: 27 05

Telegram:
1. забрать посылку
2. навестить друзей
3. помочь родителям

User: Удалить заметку

Telegram: Введите дату заметки в формате ДД/ММ (ДД ММ, ДД.ММ)
User: 27 05
Telegram: Заметка удалена



### Пример 2


User: Добавить привычку

Telegram: Введите название, описание и продолжительность привычки. Название привычки должно быть уникальным. Как разделительный символ используйте ';'.

User: Название;Описание;3

Telegram: Привычка успешно добавлена!

User: Просмотреть привычки

Telegram: Название = Название

Описание = Описание

User: Редактировать привычку

Telegram: Введите название привычки для редактирования

User: Название

Telegram: Введите новую информацию о привычке в виде:
Название: Новое название привычки
Описание: Новое описание привычки
Продолжительность: Новая продолжительность привычки
Если вы не хотите что-то менять просто не пишите это.

User: Название: НОРМ;

Telegram: Привычка успешно отредактирована!

User: Просмотреть привычки

Telegram: Название = НОРМ
Описание = Описание

User: Убрать привычку

Telegram: Введите название привычки для удаления

User: НОРМ

Telegram: Привычка успешно удалена!

User: Просмотреть привычки

Telegram: 
