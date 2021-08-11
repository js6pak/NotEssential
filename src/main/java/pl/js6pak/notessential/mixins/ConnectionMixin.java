package pl.js6pak.notessential.mixins;

import gg.essential.network.connectionmanager.Connection;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

@Mixin(Connection.class)
public class ConnectionMixin {
    @Overwrite(remap = false)
    private void doAttemptConnect() {
        throw new RuntimeException("Essential attempted make a connection, why?");
    }
}
