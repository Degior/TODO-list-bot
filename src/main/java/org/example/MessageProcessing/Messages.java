package org.example.MessageProcessing;

/**
 * Содержит возможные сообщения.
 */
public class Messages {
    /**
     * Стартовое сообщение, отображаемое при инициализации бота.
     */
    public static final String START_MESSAGE = """
            Привет! Я бот, который поможет тебе сформировать полезные привычки и ввести список твоих дел. 
            Я буду напоминать тебе о твоих привычках и следить за твоими успехами. 
            Для начала работы со мной введи "Помощь"
            """;

    /**
     * Сообщение с описанием доступных команд.
     */
    public static final String HELP_MESSAGE = """
            Я умею показывать твои дела и привычки и добавлять новые
            /help (/Помощь)
            вывести это сообщение
            /getNotesList (/Список заметок)
            показать список заметок
            /createNote (/Добавить заметку)
            добавить заметку на день
            /deleteNote (/Удалить заметку)
            удалить заметку
            /openNote (/Открыть заметку)
            открыть заметку
            /editNote (/Редактировать заметку)
            редактировать заметку
            /cancel (/Отмена)
            отменить текущее действие
            """;

    /**
     * Сообщение по умолчанию, отображаемое при вводе неизвестной команды.
     */
    public static final String DEFAULT_MESSAGE = "Неизвестная команда :( Для просмотра команд введите команду /help";

    /**
     * Сообщение, отображаемое при создании заметки пользователем.
     */
    public static final String NOTE_CREATION = "Укажите дату заметки в формате ДД/MM \n(ДД ММ, ДД.ММ)";

    /**
     * Сообщение, отображаемое при поиске заметки пользователем.
     */
    public static final String NOTE_SEARCH = "Введите название заметки в формате даты.\nУкажите дату в формате либо ДД/ММ (ДД ММ, ДД.ММ)";

    /**
     * Сообщение, отображаемое при удалении заметки пользователем.
     */
    public static final String DELETE_NOTE = "Введите дату заметки в формате ДД/ММ (ДД ММ, ДД.ММ)";

    /**
     * Сообщение, отображаемое после удаления заметки.
     */
    public static final String NOTE_DELETED = "Заметка удалена";

    /**
     * Сообщение, отображаемое при изменении заметки пользователем.
     */
    public static final String NOTE_MODIFICATION = "Теперь можешь внести в план на день несколько задач через Enter. \n";

    /**
     * Сообщение, отображаемое после добавления задачи в заметку.
     */
    public static final String TASK_ADDED = "Задача добавлена";

    /**
     * Сообщение, отображаемое при попытке создать заметку существующей даты.
     */
    public static final String NOTE_ALREADY_EXIST = "Такая заметка уже существует. Создайте новую (редактирование во 2 таске)";

    /**
     * Сообщение, отображаемое при отсутствии заметок.
     */
    public static final String NO_SUCH_NOTE = "Такой заметки не существует. Можете попробовать еще раз";

    /**
     * Сообщение, отображаемое при запросе отмены действия пользователем.
     */
    public static final String CANCEL = "Отмена";

    /**
     * Сообщение, отображаемое при отсутствии заметок.
     */
    public static final String NO_NOTES = "У вас нет заметок.";

    /**
     * Сообщение, отображаемое при редактировании заметки пользователем.
     */
    public static final String EDIT_NOTE = "Укажите дату заметки, которую хотите отредактировать в формате ДД/ММ (ДД ММ, ДД.ММ)";

    /**
     * Сообщение, отображаемое при вводе некорректного формата даты.
     */
    public static final String WRONG_DATE = "Неверный формат даты. Попробуйте еще раз";

    /**
     * Сообщение, отображаемое при редактировании заметки пользователем.
     */
    public static final String NOTE_EDITING = """
                        
            Напишите, что вы хотите сделать.
            Если вы хотите добавить задачу, напишите "Добавить 'Текст задачи'"
            Если вы хотите удалить задачу, напишите "Удалить n"
            Если вы хотите отредактировать заметку, напишите "Отметить выполненным n"
            где n - номер задачи
            """;

    /**
     * Сообщение, отображаемое после удаления задачи из заметки.
     */
    public static final String DELETED_TASK = "Задача удалена";

    /**
     * Сообщение, отображаемое после отметки задачи выполненной в заметке.
     */
    public static final String NOTE_EDITED = "Заметка отмечена выполненной";

    /**
     * Сообщение, отображаемое при вводе некорректной команды.
     */
    public static final String WRONG_COMMAND = "Неверная команда. Попробуйте еще раз";

    /**
     * Сообщение, отображаемое при вводе некорректного формата данных.
     */
    public static final String WRONG_INPUT = "Неверный формат ввода. Попробуйте еще раз";

    /**
     * Сообщение, отображаемое при указании несуществующего номера задачи.
     */
    public static final String WRONG_TASK_INDEX = "Задачи с таким номером не существует";
}
