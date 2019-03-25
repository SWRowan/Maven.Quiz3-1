package rocks.zipcode.io.quiz3.objectorientation.enums;

/**
 * @author leon on 09/12/2018.
 */
public enum RockPaperScissorHandSign {
    ROCK, PAPER, SCISSOR;

    private RockPaperScissorHandSign winner;
    private RockPaperScissorHandSign loser;

    static {
        ROCK.loser = SCISSOR;
        ROCK.winner = PAPER;
        PAPER.loser = ROCK;
        PAPER.winner = SCISSOR;
        SCISSOR.loser = PAPER;
        SCISSOR.winner = ROCK;
    }

    public RockPaperScissorHandSign getWinner() {
        return this.winner;
    }

    public RockPaperScissorHandSign getLoser() {
        return this.loser;
    }
}
