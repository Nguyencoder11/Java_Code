/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pack2;

/**
 *
 * @author ADMIN
 */
public class Newpapers extends Document {

    private int dayIssue;

    public Newpapers(String id, String nxb, int number, int dayIssue) {
        super(id, nxb, number);
        this.dayIssue = dayIssue;
    }

    public int getDayIssue() {
        return dayIssue;
    }

    public void setDayIssue(int dayIssue) {
        this.dayIssue = dayIssue;
    }

    @Override
    public String toString() {
        return "Newspaper{"
                + "dayIssue=" + dayIssue
                + ", id='" + id + '\''
                + ", nxb='" + nxb + '\''
                + ", number='" + number + '\''
                + '}';
    }
}
