package de.codecentric.Boards;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface Controller {

    Map<String, Boards> getBoards() throws BoardRequestException;
}
