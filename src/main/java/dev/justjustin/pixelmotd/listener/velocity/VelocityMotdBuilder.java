package dev.justjustin.pixelmotd.listener.velocity;

import com.velocitypowered.api.proxy.ProxyServer;
import com.velocitypowered.api.util.Favicon;
import dev.justjustin.pixelmotd.MotdType;
import dev.justjustin.pixelmotd.PixelMOTD;
import dev.justjustin.pixelmotd.listener.Icon;
import dev.justjustin.pixelmotd.listener.MotdBuilder;
import dev.mruniverse.slimelib.logs.SlimeLogs;

import java.io.File;

public class VelocityMotdBuilder extends MotdBuilder<ProxyServer, Favicon> {


    @SuppressWarnings("unchecked")
    public <T> VelocityMotdBuilder(PixelMOTD<T> plugin, SlimeLogs logs) {
        super((PixelMOTD<ProxyServer>) plugin, logs);
    }

    @Override
    public Icon<Favicon> createIcon(MotdType motdType, File icon) {
        return new VelocityIcon(
                getLogs(),
                motdType,
                icon
        );
    }
}
