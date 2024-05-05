package work.socialhub.kslack.entity.view

import com.github.seratch.jslack.api.model.ModelConfigurator

object Views {
    fun view(configurator: ModelConfigurator<View.ViewBuilder?>): View {
        return configurator.configure(View.builder()).build()
    }

    fun viewClose(configurator: ModelConfigurator<ViewClose.ViewCloseBuilder?>): ViewClose {
        return configurator.configure(ViewClose.builder()).build()
    }

    fun viewState(configurator: ModelConfigurator<ViewState.ViewStateBuilder?>): ViewState {
        return configurator.configure(ViewState.builder()).build()
    }

    fun viewSubmit(configurator: ModelConfigurator<ViewSubmit.ViewSubmitBuilder?>): ViewSubmit {
        return configurator.configure(ViewSubmit.builder()).build()
    }

    fun viewTitle(configurator: ModelConfigurator<ViewTitle.ViewTitleBuilder?>): ViewTitle {
        return configurator.configure(ViewTitle.builder()).build()
    }
}
