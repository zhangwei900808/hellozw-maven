+function($) {
	'use strict';
	var type = '[zw-type="selectmenu"]'
	var focus='.select-menu-item'
	var Selectmenu = function(element) {
		$(element).on('click.zw.selectmenu', this.toggle)
	}
	Selectmenu.VERSION = '1.0'
		
	Selectmenu.prototype.toggle = function(e) {
		var $this=$(this)
		var $parent  = getParent($this)
		var isActive = $parent.hasClass('open')
		clearMenus()
		var relatedTarget = { relatedTarget: this }
        $parent.trigger(e = $.Event('show.zw.selectmenu', relatedTarget))
		if (e.isDefaultPrevented()) return
		if (!isActive) {
			 //链接鼠标移动效果
			 $(focus).hover(mouseenter)			 
			 $this.toggleClass('selected').trigger('focus').attr('aria-shown', 'true')
			 $parent.toggleClass('open').trigger('shown.zw.selectmenu', relatedTarget)
		}
		return false
	}
	
	function clearMenus(e) {
	    if (e && e.which === 3) return
	    
	    $(type).each(function () {
	      var $this         = $(this)
	      var $parent       = getParent($this)
	      var relatedTarget = { relatedTarget: this }

	      if (!$parent.hasClass('open')) return	     
	      $parent.trigger(e = $.Event('hide.zw.selectmenu', relatedTarget))
	      if (e.isDefaultPrevented()) return

	      $this.removeClass('selected').attr('aria-shown', 'false')
	      $parent.removeClass('open').trigger('hidden.zw.selectmenu', relatedTarget)
	    })
	  }
	
	function getParent($this) {
	    var selector = $this.attr('zw-type')
	    if (!selector) {
	      selector = $this.attr('href')	      
	    }
	    var $parent = selector && $(selector)
	    return $parent && $parent.length ? $parent : $this.parent()
	  }
	
	function mouseenter()
	{
		$(focus).removeClass('select-menu-item-focus')
		$(this).addClass('select-menu-item-focus')
	}
	
	$(document)
	.on('click.zw.selectmenu', clearMenus)
	.on('click.zw.selectmenu', type, Selectmenu.prototype.toggle)
	
}(jQuery);
