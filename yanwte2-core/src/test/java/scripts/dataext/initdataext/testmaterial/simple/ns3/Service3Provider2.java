package scripts.dataext.initdataext.testmaterial.simple.ns3;

import scripts.dataext.initdataext.testmaterial.Context;
import scripts.dataext.initdataext.testmaterial.simple.Service2;
import scripts.dataext.initdataext.testmaterial.simple.Service3;

/**
 * @author Winter Young
 * @since 2017/12/13
 */
public class Service3Provider2 implements Service3 {
    @Override
    public Integer apply(Context context) {
        context.getDataExt();
        return null;
    }
}