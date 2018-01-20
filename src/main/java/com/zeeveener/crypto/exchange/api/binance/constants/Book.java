package com.zeeveener.crypto.exchange.api.binance.constants;

/**
 * Represents a combination of {@link Currency}s that can be traded for eachother.
 * <br/><br/>
 * <b>Naming Structure:</b> {@code MAJOR_MINOR}
 * <br/><br/>
 * When buying, the {@code minor} currency is traded for a certain amount of the {@code major} currency.
 * <br/>
 * When selling, the {@code major} currency is traded for a certain amount of the {@code minor} currency.
 * <br/>
 * For example: {@code ETH_BTC}. You <b>buy</b> ETH with BTC, and <b>sell</b> ETH for BTC.
 *
 * @author Zac Beemer
 */
public enum Book {
    // When adding new Books, please place them in the proper location in this enum.
    // Sorted by Minor, then by Major
    ADX_BNB(Currency.ADX, Currency.BNB),
    AION_BNB(Currency.AION, Currency.BNB),
    AMB_BNB(Currency.AMB, Currency.BNB),
    APPC_BNB(Currency.APPC, Currency.BNB),
    BAT_BNB(Currency.BAT, Currency.BNB),
    BCC_BNB(Currency.BCC, Currency.BNB),
    BCPT_BNB(Currency.BCPT, Currency.BNB),
    BRD_BNB(Currency.BRD, Currency.BNB),
    BTS_BNB(Currency.BTS, Currency.BNB),
    CMT_BNB(Currency.CMT, Currency.BNB),
    CND_BNB(Currency.CND, Currency.BNB),
    DLT_BNB(Currency.DLT, Currency.BNB),
    GTO_BNB(Currency.GTO, Currency.BNB),
    ICX_BNB(Currency.ICX, Currency.BNB),
    IOTA_BNB(Currency.IOTA, Currency.BNB),
    LSK_BNB(Currency.LSK, Currency.BNB),
    LTC_BNB(Currency.LTC, Currency.BNB),
    MCO_BNB(Currency.MCO, Currency.BNB),
    NAV_BNB(Currency.NAV, Currency.BNB),
    NEBL_BNB(Currency.NEBL, Currency.BNB),
    NEO_BNB(Currency.NEO, Currency.BNB),
    NULS_BNB(Currency.NULS, Currency.BNB),
    OST_BNB(Currency.OST, Currency.BNB),
    POWR_BNB(Currency.POWR, Currency.BNB),
    QSP_BNB(Currency.QSP, Currency.BNB),
    RCN_BNB(Currency.RCN, Currency.BNB),
    RDN_BNB(Currency.RDN, Currency.BNB),
    RLC_BNB(Currency.RLC, Currency.BNB),
    TRIG_BNB(Currency.TRIG, Currency.BNB),
    VEN_BNB(Currency.VEN, Currency.BNB),
    WABI_BNB(Currency.WABI, Currency.BNB),
    WAVES_BNB(Currency.WAVES, Currency.BNB),
    WTC_BNB(Currency.WTC, Currency.BNB),
    XLM_BNB(Currency.XLM, Currency.BNB),
    XZC_BNB(Currency.XZC, Currency.BNB),
    YOYO_BNB(Currency.YOYO, Currency.BNB),
    ADA_BTC(Currency.ADA, Currency.BTC),
    ADX_BTC(Currency.ADX, Currency.BTC),
    AION_BTC(Currency.AION, Currency.BTC),
    AMB_BTC(Currency.AMB, Currency.BTC),
    APPC_BTC(Currency.APPC, Currency.BTC),
    ARK_BTC(Currency.ARK, Currency.BTC),
    ARN_BTC(Currency.ARN, Currency.BTC),
    AST_BTC(Currency.AST, Currency.BTC),
    BAT_BTC(Currency.BAT, Currency.BTC),
    BCC_BTC(Currency.BCC, Currency.BTC),
    BCD_BTC(Currency.BCD, Currency.BTC),
    BCPT_BTC(Currency.BCPT, Currency.BTC),
    BNB_BTC(Currency.BNB, Currency.BTC),
    BNT_BTC(Currency.BNT, Currency.BTC),
    BQX_BTC(Currency.BQX, Currency.BTC),
    BRD_BTC(Currency.BRD, Currency.BTC),
    BTG_BTC(Currency.BTG, Currency.BTC),
    BTS_BTC(Currency.BTS, Currency.BTC),
    CDT_BTC(Currency.CDT, Currency.BTC),
    CMT_BTC(Currency.CMT, Currency.BTC),
    CND_BTC(Currency.CND, Currency.BTC),
    CTR_BTC(Currency.CTR, Currency.BTC),
    DASH_BTC(Currency.DASH, Currency.BTC),
    DGD_BTC(Currency.DGD, Currency.BTC),
    DLT_BTC(Currency.DLT, Currency.BTC),
    DNT_BTC(Currency.DNT, Currency.BTC),
    EDO_BTC(Currency.EDO, Currency.BTC),
    ELF_BTC(Currency.ELF, Currency.BTC),
    ENG_BTC(Currency.ENG, Currency.BTC),
    ENJ_BTC(Currency.ENJ, Currency.BTC),
    EOS_BTC(Currency.EOS, Currency.BTC),
    ETC_BTC(Currency.ETC, Currency.BTC),
    ETH_BTC(Currency.ETH, Currency.BTC),
    EVX_BTC(Currency.EVX, Currency.BTC),
    FUEL_BTC(Currency.FUEL, Currency.BTC),
    FUN_BTC(Currency.FUN, Currency.BTC),
    GAS_BTC(Currency.GAS, Currency.BTC),
    GTO_BTC(Currency.GTO, Currency.BTC),
    GVT_BTC(Currency.GVT, Currency.BTC),
    GXS_BTC(Currency.GXS, Currency.BTC),
    HSR_BTC(Currency.HSR, Currency.BTC),
    ICN_BTC(Currency.ICN, Currency.BTC),
    ICX_BTC(Currency.ICX, Currency.BTC),
    INS_BTC(Currency.INS, Currency.BTC),
    IOTA_BTC(Currency.IOTA, Currency.BTC),
    KMD_BTC(Currency.KMD, Currency.BTC),
    KNC_BTC(Currency.KNC, Currency.BTC),
    LEND_BTC(Currency.LEND, Currency.BTC),
    LINK_BTC(Currency.LINK, Currency.BTC),
    LRC_BTC(Currency.LRC, Currency.BTC),
    LSK_BTC(Currency.LSK, Currency.BTC),
    LTC_BTC(Currency.LTC, Currency.BTC),
    LUN_BTC(Currency.LUN, Currency.BTC),
    MANA_BTC(Currency.MANA, Currency.BTC),
    MCO_BTC(Currency.MCO, Currency.BTC),
    MDA_BTC(Currency.MDA, Currency.BTC),
    MOD_BTC(Currency.MOD, Currency.BTC),
    MTH_BTC(Currency.MTH, Currency.BTC),
    MTL_BTC(Currency.MTL, Currency.BTC),
    NAV_BTC(Currency.NAV, Currency.BTC),
    NEBL_BTC(Currency.NEBL, Currency.BTC),
    NEO_BTC(Currency.NEO, Currency.BTC),
    NULS_BTC(Currency.NULS, Currency.BTC),
    OAX_BTC(Currency.OAX, Currency.BTC),
    OMG_BTC(Currency.OMG, Currency.BTC),
    OST_BTC(Currency.OST, Currency.BTC),
    POE_BTC(Currency.POE, Currency.BTC),
    POWR_BTC(Currency.POWR, Currency.BTC),
    PPT_BTC(Currency.PPT, Currency.BTC),
    QSP_BTC(Currency.QSP, Currency.BTC),
    QTUM_BTC(Currency.QTUM, Currency.BTC),
    RCN_BTC(Currency.RCN, Currency.BTC),
    RDN_BTC(Currency.RDN, Currency.BTC),
    REQ_BTC(Currency.REQ, Currency.BTC),
    RLC_BTC(Currency.RLC, Currency.BTC),
    SALT_BTC(Currency.SALT, Currency.BTC),
    SNGLS_BTC(Currency.SNGLS, Currency.BTC),
    SNM_BTC(Currency.SNM, Currency.BTC),
    SNT_BTC(Currency.SNT, Currency.BTC),
    STORJ_BTC(Currency.STORJ, Currency.BTC),
    STRAT_BTC(Currency.STRAT, Currency.BTC),
    SUB_BTC(Currency.SUB, Currency.BTC),
    TNB_BTC(Currency.TNB, Currency.BTC),
    TNT_BTC(Currency.TNT, Currency.BTC),
    TRIG_BTC(Currency.TRIG, Currency.BTC),
    TRX_BTC(Currency.TRX, Currency.BTC),
    VEN_BTC(Currency.VEN, Currency.BTC),
    VIB_BTC(Currency.VIB, Currency.BTC),
    VIBE_BTC(Currency.VIBE, Currency.BTC),
    WABI_BTC(Currency.WABI, Currency.BTC),
    WAVES_BTC(Currency.WAVES, Currency.BTC),
    WINGS_BTC(Currency.WINGS, Currency.BTC),
    WTC_BTC(Currency.WTC, Currency.BTC),
    XLM_BTC(Currency.XLM, Currency.BTC),
    XMR_BTC(Currency.XMR, Currency.BTC),
    XRP_BTC(Currency.XRP, Currency.BTC),
    XVG_BTC(Currency.XVG, Currency.BTC),
    XZC_BTC(Currency.XZC, Currency.BTC),
    YOYO_BTC(Currency.YOYO, Currency.BTC),
    ZEC_BTC(Currency.ZEC, Currency.BTC),
    ZRX_BTC(Currency.ZRX, Currency.BTC),
    ADA_ETH(Currency.ADA, Currency.ETH),
    ADX_ETH(Currency.ADX, Currency.ETH),
    AION_ETH(Currency.AION, Currency.ETH),
    AMB_ETH(Currency.AMB, Currency.ETH),
    APPC_ETH(Currency.APPC, Currency.ETH),
    ARK_ETH(Currency.ARK, Currency.ETH),
    ARN_ETH(Currency.ARN, Currency.ETH),
    AST_ETH(Currency.AST, Currency.ETH),
    BAT_ETH(Currency.BAT, Currency.ETH),
    BCC_ETH(Currency.BCC, Currency.ETH),
    BCD_ETH(Currency.BCD, Currency.ETH),
    BCPT_ETH(Currency.BCPT, Currency.ETH),
    BNB_ETH(Currency.BNB, Currency.ETH),
    BNT_ETH(Currency.BNT, Currency.ETH),
    BQX_ETH(Currency.BQX, Currency.ETH),
    BRD_ETH(Currency.BRD, Currency.ETH),
    BTG_ETH(Currency.BTG, Currency.ETH),
    BTS_ETH(Currency.BTS, Currency.ETH),
    CDT_ETH(Currency.CDT, Currency.ETH),
    CMT_ETH(Currency.CMT, Currency.ETH),
    CND_ETH(Currency.CND, Currency.ETH),
    CTR_ETH(Currency.CTR, Currency.ETH),
    DASH_ETH(Currency.DASH, Currency.ETH),
    DGD_ETH(Currency.DGD, Currency.ETH),
    DLT_ETH(Currency.DLT, Currency.ETH),
    DNT_ETH(Currency.DNT, Currency.ETH),
    EDO_ETH(Currency.EDO, Currency.ETH),
    ELF_ETH(Currency.ELF, Currency.ETH),
    ENG_ETH(Currency.ENG, Currency.ETH),
    ENJ_ETH(Currency.ENJ, Currency.ETH),
    EOS_ETH(Currency.EOS, Currency.ETH),
    ETC_ETH(Currency.ETC, Currency.ETH),
    EVX_ETH(Currency.EVX, Currency.ETH),
    FUEL_ETH(Currency.FUEL, Currency.ETH),
    FUN_ETH(Currency.FUN, Currency.ETH),
    GTO_ETH(Currency.GTO, Currency.ETH),
    GVT_ETH(Currency.GVT, Currency.ETH),
    GXS_ETH(Currency.GXS, Currency.ETH),
    HSR_ETH(Currency.HSR, Currency.ETH),
    ICN_ETH(Currency.ICN, Currency.ETH),
    ICX_ETH(Currency.ICX, Currency.ETH),
    INS_ETH(Currency.INS, Currency.ETH),
    IOTA_ETH(Currency.IOTA, Currency.ETH),
    KMD_ETH(Currency.KMD, Currency.ETH),
    KNC_ETH(Currency.KNC, Currency.ETH),
    LEND_ETH(Currency.LEND, Currency.ETH),
    LINK_ETH(Currency.LINK, Currency.ETH),
    LRC_ETH(Currency.LRC, Currency.ETH),
    LSK_ETH(Currency.LSK, Currency.ETH),
    LTC_ETH(Currency.LTC, Currency.ETH),
    LUN_ETH(Currency.LUN, Currency.ETH),
    MANA_ETH(Currency.MANA, Currency.ETH),
    MCO_ETH(Currency.MCO, Currency.ETH),
    MDA_ETH(Currency.MDA, Currency.ETH),
    MOD_ETH(Currency.MOD, Currency.ETH),
    MTH_ETH(Currency.MTH, Currency.ETH),
    MTL_ETH(Currency.MTL, Currency.ETH),
    NAV_ETH(Currency.NAV, Currency.ETH),
    NEBL_ETH(Currency.NEBL, Currency.ETH),
    NEO_ETH(Currency.NEO, Currency.ETH),
    NULS_ETH(Currency.NULS, Currency.ETH),
    OAX_ETH(Currency.OAX, Currency.ETH),
    OMG_ETH(Currency.OMG, Currency.ETH),
    OST_ETH(Currency.OST, Currency.ETH),
    POE_ETH(Currency.POE, Currency.ETH),
    POWR_ETH(Currency.POWR, Currency.ETH),
    PPT_ETH(Currency.PPT, Currency.ETH),
    QSP_ETH(Currency.QSP, Currency.ETH),
    QTUM_ETH(Currency.QTUM, Currency.ETH),
    RCN_ETH(Currency.RCN, Currency.ETH),
    RDN_ETH(Currency.RDN, Currency.ETH),
    REQ_ETH(Currency.REQ, Currency.ETH),
    RLC_ETH(Currency.RLC, Currency.ETH),
    SALT_ETH(Currency.SALT, Currency.ETH),
    SNGLS_ETH(Currency.SNGLS, Currency.ETH),
    SNM_ETH(Currency.SNM, Currency.ETH),
    SNT_ETH(Currency.SNT, Currency.ETH),
    STORJ_ETH(Currency.STORJ, Currency.ETH),
    STRAT_ETH(Currency.STRAT, Currency.ETH),
    SUB_ETH(Currency.SUB, Currency.ETH),
    TNB_ETH(Currency.TNB, Currency.ETH),
    TNT_ETH(Currency.TNT, Currency.ETH),
    TRIG_ETH(Currency.TRIG, Currency.ETH),
    TRX_ETH(Currency.TRX, Currency.ETH),
    VEN_ETH(Currency.VEN, Currency.ETH),
    VIB_ETH(Currency.VIB, Currency.ETH),
    VIBE_ETH(Currency.VIBE, Currency.ETH),
    WABI_ETH(Currency.WABI, Currency.ETH),
    WAVES_ETH(Currency.WAVES, Currency.ETH),
    WINGS_ETH(Currency.WINGS, Currency.ETH),
    WTC_ETH(Currency.WTC, Currency.ETH),
    XLM_ETH(Currency.XLM, Currency.ETH),
    XMR_ETH(Currency.XMR, Currency.ETH),
    XRP_ETH(Currency.XRP, Currency.ETH),
    XVG_ETH(Currency.XVG, Currency.ETH),
    XZC_ETH(Currency.XZC, Currency.ETH),
    YOYO_ETH(Currency.YOYO, Currency.ETH),
    ZEC_ETH(Currency.ZEC, Currency.ETH),
    ZRX_ETH(Currency.ZRX, Currency.ETH),
    BCC_USDT(Currency.BCC, Currency.USDT),
    BNB_USDT(Currency.BNB, Currency.USDT),
    BTC_USDT(Currency.BTC, Currency.USDT),
    ETH_USDT(Currency.ETH, Currency.USDT),
    LTC_USDT(Currency.LTC, Currency.USDT),
    NEO_USDT(Currency.NEO, Currency.USDT)
    ;

    private final Currency major;
    private final Currency minor;

    Book(final Currency major, final Currency minor) {
        this.major = major;
        this.minor = minor;
    }

    public Currency getMajor() {
        return this.major;
    }

    public Currency getMinor() {
        return this.minor;
    }

    public String toRequestFormat() {
        return this.getMajor().toString() + this.getMinor().toString();
    }
}
