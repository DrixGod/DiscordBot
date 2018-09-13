package start;

import events.EventHandler;
import info.Ref;
import net.dv8tion.jda.core.AccountType;
import net.dv8tion.jda.core.JDA;
import net.dv8tion.jda.core.JDABuilder;
import net.dv8tion.jda.core.entities.Game;

import javax.security.auth.login.LoginException;

public class Bojack {

    private static void startBot() throws LoginException, InterruptedException {
        JDA jda = new JDABuilder(AccountType.BOT)
                .setToken(Ref.token)
                .setGame(Game.of(Game.GameType.WATCHING, Ref.show))
                .addEventListener(new EventHandler())
                .buildBlocking();
    }

    public static void main(String[] arguments) throws LoginException, InterruptedException {
        Bojack.startBot();
    }

}
