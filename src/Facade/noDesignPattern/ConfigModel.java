package Facade.noDesignPattern;

/**
 * Created by zouxiongxin on 2017/8/11.
 *  示意配置描述的数据Model，真实的配置数据会很多
 */
public class ConfigModel {
    /**
     * 是否需要生成表现层，默认是true
     */
    private boolean needGenPresentation = true;
    /**
     * 是否需要生成逻辑层，默认是true
     */
    private boolean needGendBusiness = true;
    /**
     * 是否需要数据访问层，默认是true
     */
    private boolean needGenDAO = true;

    public boolean isNeedGenPresentation() {
        return needGenPresentation;
    }

    public void setNeedGenPresentation(boolean nedGenPresentation) {
        this.needGenPresentation = nedGenPresentation;
    }

    public boolean isNeedGendBusiness() {
        return needGendBusiness;
    }

    public void setNeedGendBusiness(boolean needGendBusiness) {
        this.needGendBusiness = needGendBusiness;
    }

    public boolean isNeedGenDAO() {
        return needGenDAO;
    }

    public void setNeedGenDAO(boolean needGenDAO) {
        this.needGenDAO = needGenDAO;
    }
}

