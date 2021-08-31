package br.com.zupacademy.achiley.keyManager.integracoes.bcb

import br.com.zupacademy.achiley.TipoDeContaEnum

enum class TipoDeContaBcbEnum(val tipoDeContaEnum: TipoDeContaEnum) {
    CACC(TipoDeContaEnum.CONTA_CORRENTE),
    SVGS(TipoDeContaEnum.CONTA_POUPANCA);

    companion object {
        fun getTipoDeConta(tipoDeContaEnum: TipoDeContaEnum): TipoDeContaBcbEnum {
            return if (tipoDeContaEnum == TipoDeContaEnum.CONTA_CORRENTE) CACC else SVGS
        }
    }
}
