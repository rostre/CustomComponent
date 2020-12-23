package ro.twodoors.customcomponent

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import androidx.constraintlayout.widget.ConstraintLayout
import kotlinx.android.synthetic.main.custom_component.view.*

class CustomComponent
@JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyle: Int = 0,
    defStyleRes: Int = 0
) : ConstraintLayout (context, attrs, defStyle, defStyleRes){

    init {
        LayoutInflater.from(context)
            .inflate(R.layout.custom_component, this, true)

        attrs?.let {
            val typedArray = context.obtainStyledAttributes(it,
                R.styleable.custom_component_attributes, 0, 0)

//            val title = resources.getText(typedArray
//                .getResourceId(R.styleable
//                    .custom_component_attributes_custom_component_title,
//                    R.string.component_one))

            val title = typedArray.getString(R.styleable.custom_component_attributes_custom_component_title)

            my_title.text = title
            my_edit.hint = "${resources.getString(R.string.hint_text)} $title"

            typedArray.recycle()
        }
    }
}
