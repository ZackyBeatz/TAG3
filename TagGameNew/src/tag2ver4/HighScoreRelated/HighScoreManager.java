/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tag2ver4;
import java.util.*;
import java.io.*;
/**
 *
 * @author Zack
 */
public class HighScoreManager {
        private static final String HIGHSCORE_FILE = "scores.txt";
           ArrayList<Score> scores;

        ObjectOutputStream outputStream = null;
        ObjectInputStream inputStream = null;

        public HighScoreManager() {
            scores = new ArrayList<Score>();
         }

        public ArrayList<Score> getScores() {
           loadScoreFile();
            sort();
            return scores;
        }

        private void sort() {
           ScoreComparator comparator = new ScoreComparator();
            Collections.sort(scores, comparator);
        }

        public void addScore(String name, int score) {

            loadScoreFile();
            scores.add(new Score(name, score));
            updateScoreFile();
        }

        public void loadScoreFile() {
            //Se updateScoreFile
            try {
                inputStream = new ObjectInputStream(new FileInputStream(
                        HIGHSCORE_FILE));
                scores = (ArrayList<Score>) inputStream.readObject();
            } catch (FileNotFoundException e) {
                System.out.println("");
            } catch (IOException e) {
                System.out.println("io problem: " + e.getMessage());
            } catch (ClassNotFoundException e) {
                System.out.println("cnf problem: " + e.getMessage());
            } finally {
                try {
                    if (outputStream != null) {
                        outputStream.flush();
                        outputStream.close();
                    }
                } catch (IOException e) {
                    System.out.println("io problem: " + e.getMessage());
                }
            }
        }

        public void updateScoreFile() {
            try {
          
                outputStream = new ObjectOutputStream(new FileOutputStream(
                        HIGHSCORE_FILE));
                outputStream.writeObject(scores);
            }
         
            catch (FileNotFoundException e) {
                System.out.println("File Not Found, run the program again to fix.");
            } catch (IOException e) {
                System.out.println("IO problem, run the program again to fix.");
            }

            finally {
                try {
                    if (outputStream != null) {
                        outputStream.flush();
                        outputStream.close();
                
                    }
                } catch (IOException e) {
                    System.out
                            .println("Update problem, run the program again to fix.");
                }
            }
        }

        public String getHighscoreString() {
            String highscoreString = "";
            int max = 10;

            ArrayList<Score> scores;
            scores = getScores();

            int i = 0;
            int x = scores.size();
            if (x > max) {
                x = max;
            }

            while (i < x) {
                highscoreString += (i + 1) + ".\t" + scores.get(i).getName() + "  "
                        + scores.get(i).getScore() + "\n";
                i++;
            }

            return highscoreString;
        }
   
}

