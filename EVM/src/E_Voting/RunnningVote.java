package E_Voting;

import java.io.*;
import javax.swing.JOptionPane;

public class RunnningVote implements Serializable {
    private static final long serialVersionUID = 1L;
    private static String vname;
    private static boolean published = false;

    public RunnningVote(String s) {
        vname = s;
        saveRunningVote();
    }

    private static void saveRunningVote() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("RunningVote.ser"))) {
            oos.writeObject(vname);
            oos.writeBoolean(published);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error saving running vote details", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void setVname(String s) {
        vname = s;
        saveRunningVote();
    }

    public static String getVname() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("RunningVote.ser"))) {
            vname = (String) ois.readObject();
            published = ois.readBoolean();
        } catch (IOException | ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Error retrieving running vote details", "Error", JOptionPane.ERROR_MESSAGE);
        }
        return vname;
    }

    public static void setPublished() {
        published = true;
        saveRunningVote();
    }

    public static boolean getPublished() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("RunningVote.ser"))) {
            vname = (String) ois.readObject();
            published = ois.readBoolean();
        } catch (IOException | ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Error retrieving running vote details", "Error", JOptionPane.ERROR_MESSAGE);
        }
        return published;
    }
}
