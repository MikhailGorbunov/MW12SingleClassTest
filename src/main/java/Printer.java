

public class Printer {
    private int paper;
    private int tonerVolume;

    public Printer(int paper, int tonerVolume) {
        this.paper = paper;
        this.tonerVolume = tonerVolume;
    }

    public int getPaper() {
        return this.paper;
    }

    public void print(int pages, int copies){
        int totalPrintedPages = pages * copies;

        if (this.paper > totalPrintedPages){
            this.paper -= totalPrintedPages;
            this.tonerVolume -= totalPrintedPages;
        }
    }

    public int getToner() {
        return this.tonerVolume;
    }
}
