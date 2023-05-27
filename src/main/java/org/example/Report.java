package org.example;

/**
 * Класс Report. Содержит в себе возможные сообщения.
 */
public class Report {
    public static final String START_MESSAGE = """
            Привет! Я бот, который поможет тебе сформировать полезные привычки и ввести список твоих дел. 
            Я буду напоминать тебе о твоих привычках и следить за твоими успехами. 
            Для начала работы со мной введи /help
            """; // Стартовое сообщение
    public static final String HELP_MESSAGE = """
            Я умею показывать твои дела и привычки и добавлять новые
            /help
            вывести это сообщение
            /getNotesList
            показать список дел
            /createNote
            добавить заметку на день
            /deleteNote
            удалить заметку
            /openNote
            открыть заметку
            /addHabit
            добавить привычку
            /removeHabit
            удалить привычку
            /showHabit
            показать список привычек
            /editHabit
            редактировать привычку
            /markHabit
            отметить выполнение привычки
            """; // Сообщение с описанием команд
    public static final String DEFAULT_MESSAGE = "Неизвестная команда :( Для просмотра команд введите команду /help"; // Сообщение, если введена неизвестная команда
    public static final String HABIT_ADD = "Введите название, описание и продолжительность привычки. Название привычки должно быть уникальным. Как разделительный символ используйте перенос строки."; // Сообщение, если пользователь хочет добавить привычку
    public static final String HABIT_REMOVE = "Введите название привычки для удаления"; // Сообщение, если пользователь хочет удалить привычку
    public static final String HABIT_EDIT = "Введите название привычки для редактирования"; // Сообщение, если пользователь хочет редактировать привычку
    public static final String HABIT_EDIT_GETTER = """
            Введите новую информацию о привычке в виде:
            Название: Новое название привычки
            Описание: Новое описание привычки
            Продолжительность: Новая продолжительность привычки
            Если вы не хотите что-то менять просто не пишите это."""; // Сообщение, если пользователь хочет изменить название привычки
    public static final String HABIT_MARK = "Введите название привычки для отметки"; // Сообщение, если пользователь хочет отметить привычку
    public static final String HABIT_SHOW = "Ваши привычки:"; // Сообщение, если пользователь хочет посмотреть привычки
    public static final String HABIT_ADD_SUCCESS = "Привычка успешно добавлена!"; // Сообщение, если привычка успешно добавлена
    public static final String HABIT_ADD_FAIL = "Привычка не добавлена!"; // Сообщение, если привычка не добавлена
    public static final String HABIT_REMOVE_SUCCESS = "Привычка успешно удалена!"; // Сообщение, если привычка успешно удалена
    public static final String HABIT_REMOVE_FAIL = "Привычка не удалена!"; // Сообщение, если привычка не удалена
    public static final String HABIT_EDIT_SUCCESS = "Привычка успешно отредактирована!"; // Сообщение, если привычка успешно отредактирована
    public static final String HABIT_EDIT_FAIL1 = "Привычка не отредактирована! Не найдено привычки с таким названием"; // Сообщение, если привычка не отредактирована
    public static final String HABIT_EDIT_FAIL2 = "Привычка нельзя так  отредактировать!"; // Сообщение, если привычка не отредактирована
    public static final String NO_HABITS = "У вас нет привычек!"; // Сообщение, если у пользователя нет привычек
    public static final String HABIT_MARK_SUCCESS = "Привычка успешно отмечена!"; // Сообщение, если привычка успешно отмечена
    public static final String HABIT_MARK_FAIL = "Привычка не отмечена!"; // Сообщение, если привычка не отмечена
    public static final String NOTE_CREATION = "Чтобы создать заметку, укажите дату в формате ДД/MM \n(ДД ММ, ДД.ММ)"; // Сообщение, если пользователь хочет создать заметку
    public static final String NOTE_SEARCH = "Введите название заметки в формате даты.\nУкажите дату в формате либо ДД/ММ (ДД ММ, ДД.ММ)"; // Сообщение, если пользователь хочет найти заметку
    public static final String DELETE_NOTE = "Введите дату заметки в формате ДД/ММ (ДД ММ, ДД.ММ)"; // Сообщение, если пользователь хочет удалить заметку
    public static final String NOTE_DELETED = "Заметка удалена"; // Сообщение, если заметка удалена
    public static final String NOTE_MODIFICATION = "Теперь можешь внести в план на день несколько задач через Enter. \n"; // Сообщение, если пользователь хочет изменить заметку
    public static final String TASK_ADDED = "Задача добавлена"; // Сообщение, если задача добавлена
    public static final String NOTE_ALREADY_EXIST = "Такая заметка уже существует. Создайте новую (редактирование во 2 таске)";// Хотите ее дополнить?";
    public static final String NO_SUCH_NOTE = "Такой заметки не существует. Можете попробовать еще раз"; // Сообщение, если заметки не существует

}
