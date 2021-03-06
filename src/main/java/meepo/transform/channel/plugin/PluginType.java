package meepo.transform.channel.plugin;

import meepo.transform.channel.plugin.Merge.ComplexReplacePlugin;
import meepo.transform.channel.plugin.Merge.ReplacePlugin;
import meepo.transform.channel.plugin.TypeConvert.ParquetTypeConvertPlugin;
import meepo.transform.channel.plugin.TypeConvert.TypeConvertPlugin;

/**
 * Created by peiliping on 17-3-6.
 */
public enum PluginType {

    DEFAULT(DefaultPlugin.class),

    TYPECONVERT(TypeConvertPlugin.class),

    PARQUETTYPECONVERT(ParquetTypeConvertPlugin.class),

    REPLACEPLUGIN(ReplacePlugin.class),

    COMPLEXREPLACEPLUGIN(ComplexReplacePlugin.class),

    GROUPPLUGIN(GroupPlugin.class);

    public Class<? extends AbstractPlugin> clazz;

    PluginType(Class<? extends AbstractPlugin> clazz) {
        this.clazz = clazz;
    }
}
