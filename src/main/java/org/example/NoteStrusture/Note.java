package org.example.NoteStrusture;

import java.util.ArrayList;
import java.util.List;

/**
 * Класс представляющий собой заметку на день
 * Хранит несколько Task'ов - дел на этот день
 */
public class Note {
    private final List<Task> tasksList;

    public Note() {
        tasksList = new ArrayList<>();
    }

    /**
     * Метод добавляет задачу в заметку
     *
     * @param text текст задачи
     */
    public void addTask(String text) {
        Task task = new Task(text);
        tasksList.add(task);
    }

    /**
     * Метод для получения задач заметки
     *
     * @return taskList
     */
    public List<Task> getTasks(){
        return tasksList;
    }

    /**
     * Метод для проверки возможности удаления задачи из заметки
     *
     * @param index номер заметки, начиная с 0
     * @return true если заметка успешно удалена
     */
    public boolean deleteTask(int index) {
        if (tasksList.size() < index) {
            return false;
        }
        deleteGoodTask(index);
        return true;
    }


    /**
     * Метод для удаления одной задачи по ее номеру
     *
     * @param index номер заметки, начиная с 0
     */
    private void deleteGoodTask(int index){
        tasksList.remove(index - 1);
    }

    /**
     * Метод помечающий задачу как выполненную
     *
     * @param index номер заметки, начиная с 0
     */
    public void markTaskAsCompleted(int index) {
        tasksList.get(index - 1).setDone();
    }

    public void addTaskStatus(String status){
        tasksList.get(tasksList.size()-1).setStatus(status);
    }
}