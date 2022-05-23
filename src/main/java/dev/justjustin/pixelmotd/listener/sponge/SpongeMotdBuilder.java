package dev.justjustin.pixelmotd.listener.sponge;

import dev.justjustin.pixelmotd.MotdType;
import dev.justjustin.pixelmotd.PixelMOTD;
import dev.justjustin.pixelmotd.listener.Icon;
import dev.justjustin.pixelmotd.listener.MotdBuilder;
import dev.mruniverse.slimelib.logs.SlimeLogs;
import org.spongepowered.api.Server;
import org.spongepowered.api.network.status.Favicon;

import java.io.File;

public class SpongeMotdBuilder extends MotdBuilder<Server, Favicon> {

    @SuppressWarnings("unchecked")
    public <T> SpongeMotdBuilder(PixelMOTD<T> plugin, SlimeLogs logs) {
        super((PixelMOTD<Server>) plugin, logs);
    }

    @Override
    public Icon<Favicon> createIcon(MotdType motdType, File icon) {
        return new SpongeIcon(
                getLogs(),
                motdType,
                icon
        );
    }
}
